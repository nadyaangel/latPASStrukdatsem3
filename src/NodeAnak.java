public class NodeAnak {
    private String namaAnak;
    private NodeAnak nextAnak;
    
    public NodeAnak(){
        this.namaAnak = "";
        this.nextAnak = null;
    }

    public NodeAnak(String namaAnak){
        this.namaAnak = namaAnak;
        this.nextAnak = null;
    }

    //Setter
    public void setNamaAnak(String namaAnak){
        this.namaAnak = namaAnak;
    }
    public void setNextAnak(NodeAnak nextAnak){
        this.nextAnak = nextAnak;
    }

    //Getter
    public String getNamaAnak(){
        return this.namaAnak;
    }
    public NodeAnak getNextAnak(){
        return this.nextAnak;
    }
}
