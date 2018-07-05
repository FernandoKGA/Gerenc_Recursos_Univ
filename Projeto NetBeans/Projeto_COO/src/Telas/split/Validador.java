package Telas.split;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Validador {
        //Validadores
    public boolean taVazio(String txt) {
        if (txt == null || txt.length() == 0) {
            JOptionPane.showMessageDialog(null,"Campo não preenchido.");
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaNumero(String txt) {
        if (taVazio(txt)) {
            return false;
        }
        //for(int i=0;i<txt.length();i++){
        //  if(!Character.isDigit(txt.charAt(i))) return false;   
        //}
        if (!txt.matches("[0-9]+")) {
            return false;
        }

        return true;
    }

    public boolean verificaNUSP(String nUSP) {
        if (taVazio(nUSP)) {
            return false;
        }
        //for(int i=0;i<txt.length();i++){
        //  if(!Character.isDigit(txt.charAt(i))) return false;   
        //}
        if (nUSP.length() != 7 && nUSP.length() != 8) {
            JOptionPane.showMessageDialog(null, "Número USP inválido!\nDeve ter 7 ou 8 números.");
            return false;
        }
        if (!nUSP.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Número USP inválido!");
            return false;
        }
        return true;
    }

    public boolean verificaTexto(String txt) {
        String s = txt.toLowerCase();
        s = s.replaceAll(" ", "");
        s = removeAcentos(s);

        return s.matches("[a-z]+");
    }

    public boolean verificaTextoNumeros(String txt) {
        String s = txt.toLowerCase();
        s = s.replaceAll(" ", "");
        s = removeAcentos(s);

        return s.matches("[0-z]+");
    }

    public String removeAcentos(String txt) {
        return Normalizer.normalize(txt, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public boolean verificaData(String s) {
        // Primeiro digito do dia errado
        if (s.charAt(0) != '0' && s.charAt(0) != '1' && s.charAt(0) != '2' && s.charAt(0) != '3') {
            return false;
        }

        // Dias maiores que 31
        if (s.charAt(0) == '3') {
            if (s.charAt(1) != '0' && s.charAt(1) != '1') {
                return false;
            }
        }

        // Dia 00
        if (s.charAt(0) == '0') {
            if (s.charAt(1) == '0') {
                return false;
            }
        }

        // Primeiro digito do mes incorreto
        if (s.charAt(3) != '0' && s.charAt(3) != '1') {
            return false;
        }

        // Mes maiores que 12
        if (s.charAt(3) == '1') {
            if (s.charAt(4) != '0' && s.charAt(4) != '1' && s.charAt(4) != '2') {
                return false;
            }
        }

        // Mes 00
        if (s.charAt(3) == '0') {
            if (s.charAt(4) == '0') {
                return false;
            }
        }

        // Dia maior que 29 para o mes 02 (Fevereiro)
        if (s.charAt(3) == '0' && s.charAt(4) == '2') {
            if (s.charAt(0) == '3') {
                return false;
            }
        }

        // Dia 31 para os meses 04 (Abril), 06 (Junho), 09 (Setembro) e 11 (Novembro)
        if ((s.charAt(3) == '0' && (s.charAt(4) == '4' || s.charAt(4) == '6' || s.charAt(4) == '9'))
                || (s.charAt(3) == '1' && s.charAt(4) == '1')) {
            if (s.charAt(0) == '3' && s.charAt(1) == '1') {
                return false;
            }
        }

        return true;
    }

    public boolean comparaDataAtual(String data, String data_ftf) {
        if (((int) data_ftf.charAt(3)) < ((int) data.charAt(3))) {
            return false;
        }
        if (((int) data_ftf.charAt(4)) < ((int) data.charAt(4))) {
            return false;
        } else {
            if (((int) data_ftf.charAt(4)) == ((int) data.charAt(4))) {
                if (((int) data_ftf.charAt(0)) < ((int) data.charAt(0))) {
                    return false;
                }
                if (((int) data_ftf.charAt(1)) < ((int) data.charAt(1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String transformaData(String data_ftf) {
        String mes = data_ftf.substring(3, 5); //string do mes
        String dia = data_ftf.substring(0, 2); //string do dia
        Date agora = new Date();
        String ano = (String) new SimpleDateFormat("yyyy-").format(agora);
        ano = ano.concat(mes) + "-"; //concatena
        ano = ano.concat(dia);  //concatena
        data_ftf = ano;  //coloca em data_ftf
        return data_ftf;
    }
    // - - - - - - - - - - - - - - - - - - - -
    
}
