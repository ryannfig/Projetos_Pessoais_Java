package fichadetreino;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.Normalizer;

public class FichaDeTreino {
    public static void main(String[] args) {
    
        //Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Digite o dia da semana: ");
        //String diaSemana = scanner.nextLine();
    String resposta;  
    do
    {
         
        String diaSemana = removerAcentos(JOptionPane.showInputDialog(null,"Digite um dia da semana: ").toLowerCase());
        
        switch (diaSemana)
        {
            case "segunda":
                JOptionPane.showMessageDialog(null,"Treino de dorsal: \n"+
                "1. Puxada: 4 séries. 15, 12, 10 e 8 reps. Peso: 10 barras, 11 barras, 12 barras, 13 barras.\n" +
                "2. Puxada triângulo: 3 séries. 12, 10 e 8 reps. Peso: 8 barras, 9 barras, 10 barras.\n" +
                "3. Remada curvada(barra W): 3 séries. 12, 10 e 8 reps. Peso(cada lado): 30kg, 32kg, 33kg.\n" +
                "4. Unilateral: 3 séries. 12, 10 e 8 reps. Peso: 45kg, 50kg, 52kg.\n" +
                "5. Pull Down: 3 séries. 8 reps. Peso: 60kg.\n" +
                "6. Encolhimento: 4 séries. 15, 12, 10 e 8 reps. Peso: 50kg, 60kg, 70kg, 80kg.\n");
                break;  
                
            case "terca":
                JOptionPane.showMessageDialog(null,"Treino de peito: \n"+
               "1.Crussifixo(Polia): 4 séries. 15, 12, 10 e 8 reps. Peso: 25kg, 30kg, 35kg, 40kg.\n" +
               "2.Supino Inclinado(Halteres): 3 séries. 12, 10 e 8 reps. Peso: 22kg, 24kg(2x).\n" +
               "3.Cross Over: 3 séries. 12, 10 e 8 reps. Peso: 20kg, 25kg, 30kg.\n" +
               "4.Cross Over em baixo: 3 séries. 12, 10 e 8 reps. Peso: 10kg, 15kg(2x).\n" +
               "5.Supino máquina: 3 séries. 12, 10 e 8 reps. Peso: 8 barras, 9 barras, 10 barras.\n");
                break;
                
            case "quarta":
                JOptionPane.showMessageDialog(null,"Treino de perna: \n"+
               "1.Extensora(Unilateral): 4 séries. 15, 12, 10 e 8 reps. Peso: 9 barras, 10 barras, 11 barras, 12 barras.\n" +
               "2.Aguachamento: 3 séries. 12, 10 e 8 reps. Peso: 25kg, 28kg, 30kg.\n" +
               "3.Leg(Unilateral): 3 séries. 12, 10 e 8 reps. Peso: 90kg, 100kg.\n" +
               "4.Hack: 3 séries. 12, 10 e 8 reps. Peso: 40kg, 50kg.\n" +
               "5.Posterior de Coxa(Unilateral): 4 séries. 15, 12, 10 e 8 reps. Peso: 2 barras, 3 barras, 4 barras, 5 barras.\n" +
               "6.Stif(Halteres): 3 séries. 12, 10 e 8 reps. Peso: 28kg, 30kg, 32kg.\n" +
               "7.Mesa Flexora: 3 séries. 12, 10 e 8 reps. Peso: 8 barras, 9 barras, 10 barras.\n" +
               "8.Front Squat: 3 séries. 12, 10 e 8 reps. Peso: 30kg, 40kg.\n");
                break;
                
            case "quinta":
                JOptionPane.showMessageDialog(null,"Trenio de Deltóide: \n"+
               "1.Desenvolvimento(Halteres): 4 séries. 15, 12, 10 e 8 reps. Peso: 18kg, 20kg, 22kg.\n" +
               "2.Elevação lateral: 3 séries. 12, 10 e 8 reps. Peso: 8kg, 10kg, 12kg.\n" +
               "3.Elevação Frontal(Polia): 3 séries. 12, 10 e 8 reps. Peso: 20kg, 25kg, 30kg.\n" +
               "4.Elevação Lateral(Unilateral): 3 séries. 12, 10 e 8 reps. Peso: 10kg, 12kg, 13kg.\n" +
               "5.Posterior de Ombro(Polia/Unilateral): 3 séries. 12, 10 e 8 reps. Peso: 5kg, 7kg, 9kg.\n" +
               "6.Peck Deck Invertido: 3 séries. 12, 10 e 8 reps. Peso: 6 barras, 7 barras, 8 barras, 9 barras.\n");
                break;
                
            case "sexta":
                JOptionPane.showMessageDialog(null,"Treino de Braços: \n"+
               "1.Tríceps Francês: 4 séries. 15, 12, 10 e 8 reps. Peso: 25kg, 30kg, 35kg, 40kg.\n" +
               "2.Corda: 3 séries. 12, 10 e 8 reps. Peso: 30kg, 35kg, 40kg.\n" +
               "3.Coice: 3 séries. 12, 10 e 8 reps. Peso: 12kg, 15kg, 16kg.\n" +
               "4.Livre: 3 séries. 12, 10 e 8 reps. Peso: 26kg, 28kg, 30kg.\n" +
               "5.Bíceps Martelo(Halteres). 4 séries. 15, 12, 10 e 8 reps. Peso: 16kg, 18kg, 20kg(2x).\n" +
               "6.Banco Inclinado(Na polia). 3 séries. 12, 10 e 8 reps. Peso: 20kg, 25kg(2x).\n" +
               "7.Banco Scott(Barra W). 3 séries. 12, 10 e 8 reps. Peso: 20kg, 22kg, 24kg.\n" +
               "8.Rosca Inversa(Polia). 4 séries. 15, 12, 10 e 8 reps. Peso: 35kg, 40kg, 45kg, 50kg.\n");
               break;
               
            case "sabado":
                JOptionPane.showMessageDialog(null,"Dia de descanso.");
                break;
            case "domingo":
                JOptionPane.showMessageDialog(null,"Dia de descanso.");
                break;
            
                default:    
                    JOptionPane.showMessageDialog(null,"Inválido. Por favor, digite um dia da semana.");
        }
           resposta = JOptionPane.showInputDialog(null,"Deseja ver outra ficha de outro dia ou algum dia de descanso? (s/n)");
            
    }while(resposta != null && resposta.equalsIgnoreCase("s"));
        //scanner.close();
        
        JOptionPane.showMessageDialog(null, "Programa finalizado.");
        
       
        }    
           public static String removerAcentos(String texto)
        {
            return Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
        }
        
    }
    
    
   
    
    
   


       
