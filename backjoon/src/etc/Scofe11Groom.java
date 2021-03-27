package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class Scofe11Groom {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		Date totalTime = sdf.parse(st.nextToken());
		
		Date[] playtime = new Date[N];
		String HH = "00:";
		for (int i = 0; i < N; i++) {
			playtime[i] = sdf.parse(HH + br.readLine());
		}
		
		int plusSec = 0;

		int maxCount = 0;
		int startPoint = 0;
		// 시작점 다 시도해보기 (마지막곡에서는 시작X)
		for (int startFrom = 0; startFrom < N-1; startFrom++) {
			long tmpTotal = totalTime.getTime() + plusSec;
			int count = 0;
			
			for (int i = startFrom; i < N; i++) {
				if(tmpTotal > 0) {
					
					tmpTotal -= (playtime[i].getTime() + plusSec);
					count++;
					// bw.write("tmpTotal : " + tmpTotal + "\n");
					long tttt = playtime[i].getTime() + plusSec;
					// bw.write("playtime[i].getTime() + plusSec : " + tttt + "\n");
					// bw.write("count : " + count + "\n");
				}else break;
			}
			
			if(count > maxCount) {
				maxCount = count;
				startPoint = startFrom + 1;
			}
		}
		
		bw.write(maxCount + " " + startPoint);
		
		bw.close();
	}
	
}