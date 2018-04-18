public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
String honorPath = "";
if (honorScore < targetHonorScore) {
int score = targetHonorScore - honorScore;
if (score %2 == 0) {
honorPath = "2kyus: " + 0;
honorPath = honorPath + ", 1kyus: " + score /2;

}
else {
System.out.println(score %2);
System.out.println(score/2);
honorPath = "2kyus: " + score %2;
honorPath = honorPath + ", 1kyus: " + score /2;
}

return honorPath;

}
return honorPath;


    }
}
