package com.skyline.ejbconvert;

import javax.naming.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        props.setProperty("java.naming.provider.url", "localhost:1099");
        try {
            InitialContext ctx = new InitialContext(props);
            IConvert c = (IConvert)ctx.lookup("ConvertBean/remote");
            System.out.println("89 dollar = " + c.dollarToYuan(89) + " Yuan");
            System.out.print("89 yuan = " + c.yuanToEuro(89) + " Euro");
        } catch (NamingException e) {
            System.out.println(e.getMessage());
        }
    }
}
