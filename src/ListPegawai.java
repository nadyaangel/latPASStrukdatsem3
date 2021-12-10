public class ListPegawai {
    private NodePegawai headPegawai;
    private NodePegawai tailPegawai;

    public ListPegawai(){
        this.headPegawai = null;
        this.tailPegawai = null;
    }

    // INI TDK USAH PAKE GETHEAD GETTAIL INGATT

    public void insertPegawai(String newNIPPegawai, String newNamaPegawai){
        NodePegawai newNodePegawai = new NodePegawai(newNIPPegawai, newNamaPegawai);
        if(this.headPegawai == null && this.tailPegawai == null){
            this.headPegawai = newNodePegawai;
            this.tailPegawai = newNodePegawai;
        }
        else{
            this.tailPegawai.setNextPegawai(newNodePegawai);
            tailPegawai = newNodePegawai;
        }
    }
//perbaiki ini
    public void insertAnak(String NIPPegawai, String NamaAnak){
        NodePegawai tempPegawai;
        tempPegawai = this.headPegawai;

        while ((tempPegawai != null ) && (tempPegawai.getNIPPegawai() != NIPPegawai)){
            tempPegawai = tempPegawai.getNextPegawai();
        }

        if(tempPegawai != null){
            NodeAnak newNodeAnak = new NodeAnak(NamaAnak);
                if(tempPegawai.getHeadAnak() == null){
                    tempPegawai.setHeadAnak(newNodeAnak);
                }
                else{
                    NodeAnak tempAnak = tempPegawai.getHeadAnak();
                    while(tempAnak.getNextAnak() != null){
                        tempAnak = tempAnak.getNextAnak();
                    }
                    tempAnak.setNextAnak(newNodeAnak);
                }
            
        }
        else{
            System.out.println("NIP tidak ditemukan! ");
        }
    }

    public void cetakPegawai(){
        NodePegawai tempPegawai = this.headPegawai;
        while(tempPegawai != null){
            System.out.println("NIP : " + tempPegawai.getNIPPegawai());
            System.out.println("Nama : " + tempPegawai.getNamaPegawai());
            System.out.println("");
            tempPegawai = tempPegawai.getNextPegawai();
        }
    }

    public void cetakPegawaiAnak(){
        NodePegawai tempPegawai = this.headPegawai;
        NodeAnak tempAnak;
        while(tempPegawai != null){
            System.out.println("NIP : " + tempPegawai.getNIPPegawai());
            System.out.println("Nama : " + tempPegawai.getNamaPegawai());

            tempAnak = tempPegawai.getHeadAnak();
            while(tempAnak != null){
                System.out.println("Nama Anak : " + tempAnak.getNamaAnak());
                tempAnak = tempAnak.getNextAnak();
            }

            System.out.println("");
            tempPegawai = tempPegawai.getNextPegawai();
        }
    }
}
