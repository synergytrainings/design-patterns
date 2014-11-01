package com.armen.mkrtchyan.builder.select;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 02, 2014</pre>
 */
public class SelectBuilder {

    private StringBuilder query = new StringBuilder();

    public Select select(String... columns) {
        return new Select(columns);
    }

    public class Select {

        private Select(String... columns) {
            query.append("Select ");
            for (String column : columns) {
                query.append(column).append(',');
            }
            query.deleteCharAt(query.length() - 1);
            query.append(" ");
        }

        public From from(String... tables) {
            return new From(tables);
        }

    }

    public class From {

        private From(String... tables) {
            query.append("from ");
            for (String table : tables) {
                query.append(table).append(',');
            }
            query.deleteCharAt(query.length() - 1);
            query.append(" ");
        }

        public Where where(String condition) {
            return new Where(condition);
        }

        public SelectQuery build() {
            return new SelectQuery(query.toString());
        }
    }

    public class Where {

        private Where(String condition) {
            query.append("where ").append(condition).append(' ');
        }

        public OrderBy orderBy(String... columns) {
            return new OrderBy(columns);
        }

        public SelectQuery build() {
            return new SelectQuery(query.toString());
        }

    }

    public class OrderBy {

        private OrderBy(String... columns) {
            query.append("order by ");
            for (String column : columns) {
                query.append(column).append(',');
            }
            query.deleteCharAt(query.length() - 1);
            query.append(" ");
        }

        public SelectQuery build() {
            return new SelectQuery(query.toString());
        }
    }

}
