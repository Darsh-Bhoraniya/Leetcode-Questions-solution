public class Average_Waiting_Time {
    public double averageWaitingTime(int[][] customers) {
        double totalTime=0;
        int n=customers.length;
        int finishTime=0;
        for(int i=0;i<customers.length;i++){
            if(finishTime<customers[i][0]){
                int waitingTime=customers[i][1];
                totalTime+=waitingTime;
                finishTime=customers[i][0]+customers[i][1];
            }else{
                int waitingTime=finishTime+customers[i][1]-customers[i][0];
                totalTime+=waitingTime;
                finishTime+=customers[i][1];
            }
        }
        return totalTime/n;
    }
}
