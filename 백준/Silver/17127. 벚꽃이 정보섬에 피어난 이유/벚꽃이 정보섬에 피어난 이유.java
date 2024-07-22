import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nums= new int[N];
        int max = 0;
        String[] line = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            nums[i] = Integer.parseInt(line[i]);
        }

        for(int i=0;i<N-3;i++){
            for(int j=i+1;j<N-2;j++){
                for(int k=j+1;k<N-1;k++){
                    for(int l=k+1;l<N;l++){
                        int g1_sum = 1;
                        int g2_sum = 1;
                        int g3_sum = 1;
                        int g4_sum = 1;

                        for(int s=0;s<=i;s++){
                            g1_sum*=nums[s];
                        }

                        for(int s=i+1;s<=j;s++){
                            g2_sum*=nums[s];
                        }

                        for(int s=j+1;s<=k;s++){
                            g3_sum*=nums[s];
                        }

                        for(int s=k+1;s<N;s++){
                            g4_sum*=nums[s];
                        }

                        if(max<g1_sum+g2_sum+g3_sum+g4_sum) max=g1_sum+g2_sum+g3_sum+g4_sum;

                    }
                }
            }
        }

        bw.write(max+"");
        bw.flush();
        bw.close();
        br.close();
    }
}