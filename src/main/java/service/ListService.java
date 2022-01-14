package service;

import model.List;

public class ListService {
    private static List list = new List("English",25,false,"Thor");

    public void save(List newList){
        list.setLanguage(newList.getLanguage());
        list.setPage(newList.getPage());
        list.setFilter(newList.isFilter());
        list.setSignature(newList.getSignature());
    }

    public List read() {
        return list;
    }
}
