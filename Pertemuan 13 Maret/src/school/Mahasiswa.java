//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package school;

public class Mahasiswa extends Manusia {
        String NIM;
        int semester;
        int angkatan;
        double ipk;
        int absens;
        private String Password;

        public Mahasiswa (String namaMahasiswa, String nimMahasiswa)
        {
            super.Nama = namaMahasiswa;
            super.Umur = Umur;
            NIM = nimMahasiswa;
            absens = 0;
            this.NIM = nimMahasiswa;
            this.absens = 0;
        }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void bolehUjian(){
        if (absens > 7){
            System.out.println("Tidak Boleh Ujian");
        } else {
            System.out.println("Boleh Ujian");
        }
    }

    @Override
    public String toString(){
            return "Nama = " + Nama +
                    "\nNim = " + NIM +
                    "\nAngkatan = " + angkatan +
                    "\nsemester = " + semester +
                    "\nIPK = " + ipk +
                    "\nAbsens = " + absens;
    }
}