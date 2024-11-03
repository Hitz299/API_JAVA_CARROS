package br.com.fiap.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


public class CadastrarCarroDTO {
    @NotBlank
    @Size(max = 17)
    private String chassi;

    @NotBlank
    @Size(max = 7)
    private String placa;

    @NotBlank
    @Size(max = 20)
    private String cor;

    @NotBlank
    @Size(max = 40)
    private String motor;

    @NotBlank
    @Size(max = 30)
    private String marca;

    @NotBlank
    @Size(max = 30)
    private String modelo;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    
    
}