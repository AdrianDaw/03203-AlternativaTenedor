/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {
// Instanciar Scanner

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes tipos comida
        final String COMIDA1 = "carne";
        final String COMIDA2 = "pescado";
        //Núm de puas tenedores
        final int PUAS0 = 0;
        final int PUAS1 = 3;
        final int PUAS2 = 4;

        //Variables
        int puas;
        String tipoComida;

        //Insertar cabecera
        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        //introduce tipo comida
        System.out.printf("Tipo de comida ..: ");

        //pasamos el String a lowercase...
        tipoComida = SCN.nextLine().toLowerCase();

        //Analiza el tipo de comida.
        if (tipoComida.equals(COMIDA1)) {
            puas = PUAS1;
        } else if (tipoComida.equals(COMIDA2)) {
            puas = PUAS2;
        } else {
            puas = PUAS0;
        }

        //Separador
        System.out.println("---");

        //Salida
        System.out.printf("Tenedor con .....: %d púas%n", puas);

    }
}