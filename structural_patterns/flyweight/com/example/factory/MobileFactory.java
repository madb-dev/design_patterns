package com.example.factory;

import com.example.MobilePhone;
import com.example.devices.Iphone;
import com.example.devices.Samsung;
import java.util.HashMap;
import java.util.Map;

public class MobileFactory {

  private static Map<String, MobilePhone> mobiles = new HashMap();

  public static MobilePhone getIPhoneMobile(Integer ram, Integer storage) {
    String keyIphone = ram + ":" + storage + "-iphone";
    System.out.println(keyIphone);

    if (!mobiles.containsKey(keyIphone)) {
      mobiles.put(keyIphone, new Iphone(ram, storage));
    }

    return mobiles.get(keyIphone);
  }

  public static MobilePhone getSamsungMobile(Integer ram, Integer storage) {
    String keySamsung = ram + ":" + storage + "-samsung";
    System.out.println(keySamsung);

    if (!mobiles.containsKey(keySamsung)) {
      mobiles.put(keySamsung, new Samsung(ram, storage));
    }

    return mobiles.get(keySamsung);
  }
}
