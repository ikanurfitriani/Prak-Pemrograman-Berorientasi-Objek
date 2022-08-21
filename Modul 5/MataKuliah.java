public class MataKuliah {
	private String[] matkul;

	public MataKuliah(String[] matkul) {
		this.matkul = matkul;
	}
	public void cetakMataKuliah() {
		for(int x = 0; x < matkul.length; x++) {
			System.out.println("Mata kuliah ke "+(x+1)+": "+this.matkul[x]);
		}
	}
}