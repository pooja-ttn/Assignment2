package Question_1_2;

public class Database {

        private int port;
        private String name;

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Question_1_2.Database.Database { " +
                    "port=" + port +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

