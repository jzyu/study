package jzyu.ThinkInJava.chp11;

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder());

        //此处产生编译错误：因为asList参数列表中只有Powder类型，因此会创建出List<Powder>类型而非List<Snow>类型
        //List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
