
 import java.util.HashMap;
import java.util.Map;

/**
 * homework2_tsask1
 */
public class homework2_tsask1 {

    

    public static void main(String[] args) {
        Map<String, String> filters = new HashMap<>();
        filters.put("name", "Ivanov");
        filters.put("country", "Russia");
        filters.put("city", "Moscow");
        filters.put("age", null);

        String query = buildQuery(filters);
        System.out.println(query);
    }

    private static String buildQuery(Map<String, String> filters) {
        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM users WHERE ");

        for (Map.Entry<String, String> filter : filters.entrySet()) {
            String key = filter.getKey();
            String value = filter.getValue();

            if (value != null) {
                queryBuilder.append(key).append("='").append(value).append("' AND ");
            }
        }

        if (queryBuilder.toString().endsWith("AND ")) {
            queryBuilder.delete(queryBuilder.length() - 5, queryBuilder.length());
        }

        return queryBuilder.toString();
    }
}



    