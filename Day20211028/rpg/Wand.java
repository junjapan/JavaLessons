package Day20211028.rpg;

public class Wand {
    private String name;
    private double power;
    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPower(double power){
        if(power < 0.5 || power > 100d){
            throw new IllegalArgumentException("増幅率は０．５から１００の間で設定してください");
        }
        this.power=power;
    }
    public double getPower(){
        return this.power;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){return true;}
        if(o instanceof Wand){
            Wand w = (Wand)o;
            if(w.getName().equals(this.name) && w.getPower() == this.power){
                return true;
            }
        }
        return false;
    }
}
