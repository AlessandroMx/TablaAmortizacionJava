package com.soa.amortizacion.business;

import com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion;
import com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla;
import com.soa.amortizacion.ResponseAmortizacionDocument.ResponseAmortizacion.Tabla.Registro;

public class AmortizacionLogic {

    public static Tabla generateTable(ResponseAmortizacion response,
            double montoTotal, int numeroPagos, double interesAnual) {

        Tabla tabla = response.addNewTabla();

        double saldoInicial = montoTotal;
        double interesMensual = interesAnual / 12;
        double cuota = montoTotal * ((interesMensual)
                / (1 - Math.pow((1 + (.11 / 12)), (-1 * numeroPagos))));

        for (int i = 1; i <= numeroPagos; i++) {
            Registro tempReg = tabla.addNewRegistro();
            tempReg.setPeriodo(i);
            tempReg.setSaldoInicial(saldoInicial);
            tempReg.setCuotas(cuota);
            tempReg.setIntereses(saldoInicial * interesMensual);
            tempReg.setAbonoCapital(cuota - tempReg.getIntereses());
            saldoInicial -= tempReg.getAbonoCapital();
            tempReg.setSaldoFinal(saldoInicial);
        }

        return tabla;
    }

}
