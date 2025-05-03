import java.util.Scanner;
class Length_of_day{
    String start;
    String end;
    Length_of_day(String s,String e){
        start=s;
        end=e;
    }
    void calculate(){
    String[] start_arr=start.split("-");
    String[] end_arr=end.split("-");
    int s_year=Integer.parseInt(start_arr[0]);
    int s_month=Integer.parseInt(start_arr[1]);
    int s_day=Integer.parseInt(start_arr[2]);
    int e_year=Integer.parseInt(end_arr[0]);
    int e_month=Integer.parseInt(end_arr[1]);
    int e_day=Integer.parseInt(end_arr[2]);
    int days=0;
    days+=cal_len(s_year,s_month,s_day,true);
    for(int i=s_year+1;i<e_year;i++){
        if(isleapyear(i)){
            days+=366;
        }else{
            days+=365;
        }
    }
    days+=cal_len(e_year,e_month,e_day,false);
    System.out.print(days);
    }
    int cal_len(int year,int month,int day,boolean check){
        int days[]={31,isleapyear(year)? 29:28,31,30,31,30,31,31,30,31,30,31};
        int dayz=0;
        if(check){
            for(int i=month-1;i<12;i++){
                if(i==month-1){
                    dayz+=days[i]-day+1;
                }else{
                    dayz+=days[i];
                }
            }
        }else{
            for(int i=0;i<month-1;i++){
                dayz+=days[i];
            }
            dayz+=day;
            
        }
        return dayz;
    }
    boolean isleapyear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    
}
public class day_length {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String start=sc.nextLine();
        String end=sc.nextLine();
        Length_of_day ll=new Length_of_day(start,end);
        ll.calculate();

    }
}
