import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class newsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<news> na=new ArrayList<>();
		news n1=new news(1541,"raman" , "seema","Interesing news, Contain important details , some specific details of budget missing");
		news n2=new news(3266, "riya" , "arpita"," Content is accurate");
		news n3=new news(2133,"meena" , "rohan","Appropriate news, We know the budget");
		na.add(n1);na.add(n2);na.add(n3);
		Map<Integer,List<news>> groupByNewsId = na.stream()
                .collect(Collectors.groupingBy(news::getNewsid));
		int max = 0 ,  newsId = 0;
        for (Map.Entry<Integer,List<news>> M : groupByNewsId.entrySet())
        {
            if(max < M.getValue().size())
            {
                max = M.getValue().size();
                newsId = M.getKey();
            }
        }
        System.out.println("News Id : "+newsId);
	}
}
