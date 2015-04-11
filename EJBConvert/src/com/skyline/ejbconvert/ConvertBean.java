package com.skyline.ejbconvert;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created by skyline on 15/4/10.
 */

@Stateless
@Remote(IConvert.class)
public class ConvertBean implements IConvert{
    @Override
    public double dollarToYuan(double dollars) {
        return dollars * 6.2077;
    }

    @Override
    public double yuanToEuro(double yuan) {
        return yuan * 0.1510;
    }
}
