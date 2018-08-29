package cn.sunxyz.common.excel.area;

import java.util.Set;

/**
 * @author Neo.fang@carlt.com.cn
 * @creatTime 2018/8/28 0028
 */
public class Areast {

    private String id;

    private String name;

    private String pinyin;

    private Set<Areast> childSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Set<Areast> getChildSet() {
        return childSet;
    }

    public void setChildSet(Set<Areast> childSet) {
        this.childSet = childSet;
    }
}
