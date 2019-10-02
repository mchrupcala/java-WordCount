package WordCount;

public class WordList {

    private String list;
    
    public WordList(String list){
        this.list = list;
    }

    public String getList() {
        return list;
    }

    @Override
    public String toString()
    {
        return "UN Words{" +
                list + '\'';
    }

}

