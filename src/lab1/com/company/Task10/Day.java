package lab1.com.company.Task10;

public class Day {
   // String[] dayName = {"MONADAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        private String name;

        public String getName() {
            return name;
        }

        public Day(String name){

            this.name=name;
        }


    @Override
    public String toString() {
        return name;
    }
}
