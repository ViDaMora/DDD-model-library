package co.com.sofka.factura;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.factura.events.DescuentoAplicado;
import co.com.sofka.factura.events.FacturaCreada;
import co.com.sofka.orden.values.ValorTotal;

public class FacturaChange extends EventChange {
    public FacturaChange(Factura factura) {
        apply((FacturaCreada facturaCreada)->{
            factura.ordenid = facturaCreada.getOrdenid();
            factura.fecha = facturaCreada.getFecha();
            factura.valorTotal = facturaCreada.getValorTotal();
            factura.vendedorid= facturaCreada.getVendedorid();
        });

        apply((DescuentoAplicado descuentoAplicado)->{
            var descuento = Double.valueOf(factura.valorTotal.getValor()*0.2);
            descuento=descuento+factura.valorTotal.getValor();
            if(factura.ordenid.equals(descuentoAplicado.getOrdenid())){
                factura.valorTotal= new ValorTotal(descuento);
            }
        });
    }
}
