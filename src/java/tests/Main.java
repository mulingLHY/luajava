package tests;

import com.luajava.LuaState;
import com.luajava.LuaStateFactory;

public class Main {
    public static void main(String[] args){
        LuaState a=LuaStateFactory.newLuaState();
        a.openLibs();
        a.LloadString("luajava.bindClass('tests.Main').print(3,1234,luajava,'9')");
        a.call(0,0);
        
        //System.out.println(System.getProperty("user.dir"));
    }
    public static void print(int i,Object... a){
        for(int j=0;j<Integer.valueOf(i);j++)
            System.out.println(a[j]);
    }
}