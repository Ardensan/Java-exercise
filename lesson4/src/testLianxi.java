import java.util.StringJoiner;
public class testLianxi {
    public static void main(String[] args) {
        String[] files={"name","position","salary"};
        String table="employee";
        String select=buildSelectSql(table,files);
        System.out.println(select);
        System.out.println("SELECT name,position,salary FROM employee".equals(select)?"测试成功":"测试失败");
    }
    static String buildSelectSql(String table,String[] fields){
        StringJoiner sj=new StringJoiner(",","SELECT "," FROM "+table);
        for(String n:fields){
            sj.add(n);
        }
        return sj.toString();
    }
}
