import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortjava8 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(235,121,282,166,679);
		Collections.sort(l, (I1,I2)->I1%10>I2%10?-1:I1%10<I2%10?1:0);
		System.out.println("Last integer values"+ l);
        List<Integer> l1 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        Integer l2 = l.stream().min((s1,s2)->s1.compareTo(s2)).get();
        Integer l3 = l.stream().max((m1,m2)->m1.compareTo(m2)).get();
        List<Integer>l4=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer>l5=l.stream().map(i2->i2*2).collect(Collectors.toList());
        long l6=l.stream().count();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
		
	}

}
