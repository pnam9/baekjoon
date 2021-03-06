package Day01;

public class Lotto {

public int[] solution(int[] lottos, int[] win_nums) {
        
        int cnt = 0;
        int zeroCnt = 0;
        
        for(int lotto: lottos){
        
        	//2. 
            if(lotto == 0) {
                zeroCnt ++;
                continue;
            }
            for(int win_num:win_nums){
            	//3.
                if(win_num == lotto){
                    cnt ++;
                    break;
                }
            }
        }
        //4.
        return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
    }
}
//프로그래머스 문제 나중에 이해 해보고 다시 풀어보도록
