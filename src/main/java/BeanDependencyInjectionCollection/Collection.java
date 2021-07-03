package BeanDependencyInjectionCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
    private List manList;
    private Set manSet;
    private Map manMap;
    private Properties manProp;

    public void setManList(List manList) {
        this.manList = manList;
    }

    public List getManList() {
        System.out.println("manList: "+manList);
        return manList;
    }

    public void setManMap(Map manMap) {
        this.manMap = manMap;
    }

    public Map getManMap() {
        System.out.println("manMap: "+manMap);
        return manMap;
    }

    public void setManProp(Properties manProp) {
        this.manProp = manProp;
    }

    public Properties getManProp() {
        System.out.println("manProp: "+manProp);
        return manProp;
    }

    public void setManSet(Set manSet) {
        this.manSet = manSet;
    }

    public Set getManSet() {
        System.out.println("manSet: "+manSet);
        return manSet;
    }
}
