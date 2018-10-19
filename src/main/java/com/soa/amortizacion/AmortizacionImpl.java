/**
 * AmortizacionSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.soa.amortizacion;

import com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion;
import com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla;
import com.soa.amortizacion.business.AmortizacionLogic;

/**
 * AmortizacionSkeleton java skeleton for the axisService
 */
public class AmortizacionImpl extends AmortizacionSkeleton {
    /**
     * Auto generated method signature
     *
     * @param requestAmortizacion
     * @return responseAmortizacion
     */
    public ResponseAmortizacionDocument amortizacion(
            RequestAmortizacionDocument requestAmortizacion) {

        // Initialize response object
        ResponseAmortizacionDocument doc = ResponseAmortizacionDocument.Factory
                .newInstance();
        ResponseAmortizacion response = doc.addNewResponseAmortizacion();

        // Set parameters for the business logic
        double montoTotal = requestAmortizacion.getRequestAmortizacion()
                .getMontoTotal();
        int numeroPagos = requestAmortizacion.getRequestAmortizacion()
                .getNumeroPagos();
        double interesAnual = requestAmortizacion.getRequestAmortizacion()
                .getInteresAnual();

        // Call business logic
        Tabla tabla = AmortizacionLogic.generateTable(response, montoTotal,
                numeroPagos, interesAnual);

        // Add result ("Tabla" instance) to the response
        response.setTabla(tabla);
        
        doc.setResponseAmortizacion(response);

        return doc;
    }
}
