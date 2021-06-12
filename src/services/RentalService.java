package services;

import com.sun.xml.internal.ws.api.SOAPVersion;
import model.entites.CarRental;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxServices taxServices;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
    }
    public void processInvoice(CarRental carRental){

    }

}
