/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Irakli Kardava <iraklikardawa@gmail.com>
 */
public class OperacjaNaPlikach
{

  public int[] sprawdzListe() throws IOException, InvalidNumber
  {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    wyszwietlKomunikat("PODAJ LICZBY Z ZAKRESI 1-49: ");

    int tab[] = new int[6];
    for (int i = 0; i < tab.length; i++)
    {
      tab[i] = sprawdzLiczbe(br);

    }
    return tab;
  }

  public int sprawdzLiczbe(BufferedReader br) throws IOException, InvalidNumber
  {
    boolean poprawnosc = false;
    int j = 0;

    do
    {
      try
      {
        j = Integer.parseInt(br.readLine());
        if (j < 1 || j > 49)
        {
          throw new InvalidNumber();
        } else
        {
          poprawnosc = true;
        }

      } catch (NumberFormatException e)
      {
        wyszwietlBland("TO NIE JEST LICZBA");
      } catch (InvalidNumber k)
      {
        wyszwietlBland("LICZBA POZA ZAKRESEM");

      }

    } while (!poprawnosc);

    return j;
  }

  public void wyszwietlKomunikat(String str)
  {
    System.out.println(str);
  }

  public void wyszwietlBland(String str)
  {
    System.err.println(str);
  }

  private static class InvalidNumber extends Exception
  {

    public InvalidNumber()
    {
    }
  }
}
