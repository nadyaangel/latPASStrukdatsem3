public class NodePegawai {
    private String NIPPegawai;
    private String namaPegawai;
    private NodeAnak headAnak;
    private NodePegawai nextPegawai;

    public NodePegawai(){
        this.NIPPegawai = "";
        this.namaPegawai = "";
        this.nextPegawai = null;
    }

    public NodePegawai(String newNIPPegawai, String newNamaPegawai){
        this.NIPPegawai = newNIPPegawai;
        this.namaPegawai = newNamaPegawai;
        this.nextPegawai = null;
    }

    //Setter
    public void setNIPPegawai(String newNIPPegawai){
        this.NIPPegawai = newNIPPegawai;
    }

    public void setNamaPegawai(String newNamaPegawai){
        this.namaPegawai = newNamaPegawai;
    }

    public void setHeadAnak(NodeAnak headAnak){
        this.headAnak = headAnak;
    }

    public void setNextPegawai(NodePegawai nextPegawai){
        this.nextPegawai = nextPegawai;
    }

    //Getter
    public String getNIPPegawai(){
        return this.NIPPegawai;
    }
    public String getNamaPegawai(){
        return this.namaPegawai;
    }
    public NodeAnak getHeadAnak(){
        return this.headAnak;
    }
    public NodePegawai getNextPegawai(){
        return this.nextPegawai;
    }
}
