class Number_of_Students_Unable_to_Eat_Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int i = 0; i < students.length; i++)
            count[students[i]]++;
        
        for (int i = 0; i < sandwiches.length; i++) {
            int sandwich = sandwiches[i];
            if (count[sandwich] == 0)
                break;
            
            count[sandwich]--;
        }
        
        return count[0] + count[1];
    }       
}
