package com.treinamento.aluraviagens.util;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormataIda = formatoBrasileiro.format(dataIda.getTime());
        String dataFormataVolta = formatoBrasileiro.format(dataVolta.getTime());
        String dataFormataDaViagem = dataFormataIda + " - "
                + dataFormataVolta + " de "
                + dataVolta.get(Calendar.YEAR);
        return dataFormataDaViagem;
    }

}
