package hu.uni.eszterhazy.frameworks.model;

public class ISCO {

    public ISCO(long order,int level,int code,long parent,String codeOc ,String parentOc){
        this.setOrder(order);
        this.setLevel(level);
        this.setCode(code);
        this.setParent(parent);
        this.setCodeOc(codeOc);
        this.setParentOc(parentOc);
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public String getCodeOc() {
        return codeOc;
    }

    public void setCodeOc(String codeOc) {
        this.codeOc = codeOc;
    }

    public String getParentOc() {
        return parentOc;
    }

    public void setParentOc(String parentOc) {
        this.parentOc = parentOc;
    }

    private long order;
    private int level;
    private int code;
    private long parent;
    private String codeOc;
    private String parentOc;

}

