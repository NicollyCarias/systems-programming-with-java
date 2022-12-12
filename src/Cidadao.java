public class Cidadao extends Pessoa{
	private String dataPrimeiraDose;
	private String dataSegundaDose;
	private String dataTerceiraDose;
	private String dataQuartaDose;

	public Cidadao() {
	}
	public String getDataPrimeiraDose() {
		return dataPrimeiraDose;
	}
	public void setDataPrimeiraDose(String dataPrimeiraDose) {
		this.dataPrimeiraDose = dataPrimeiraDose;
	}
	public String getDataSegundaDose() {
		return dataSegundaDose;
	}
	public void setDataSegundaDose(String dataSegundaDose) {
		this.dataSegundaDose = dataSegundaDose;
	}
	public String getDataTerceiraDose() {
		return dataTerceiraDose;
	}
	public void setDataTerceiraDose(String dataTerceiraDose) {
		this.dataTerceiraDose = dataTerceiraDose;
	}
	public String getDataQuartaDose() {
		return dataQuartaDose;
	}
	public void setDataQuartaDose(String dataQuartaDose) {
		this.dataQuartaDose = dataQuartaDose;
	}

	public void imprimirDados(){
		System.out.println("Atenção! Informe o Nome: "+getNome());
		System.out.println("Atenção! Informe o CPF: "+getCpf());        
		System.out.println("Atenção! Informe a data da 1ª dose: "+getDataPrimeiraDose());
		System.out.println("Atenção! Informe a data da 2ª dose: "+getDataSegundaDose());
		System.out.println("Atenção! Informe a data da 3ª dose: "+getDataTerceiraDose());
		System.out.println("Atenção! Informe a data da 4ª dose: "+getDataQuartaDose());
	}
}
