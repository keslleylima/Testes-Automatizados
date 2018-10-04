package br.com.caelum.leilao;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created Keslley Lima
 */
public class TesteUnitario {

    @Test
    public void main() {

        Usuario joao = new Usuario("Keslley");
        Usuario maria = new Usuario("Cleitão");
        Usuario ana = new Usuario("Jonelson");

        Leilao leilao = new Leilao("MacBok muito caro");

        leilao.propoe(new Lance(joao, 2000.00));
        leilao.propoe(new Lance(ana, 3000.00));
        leilao.propoe(new Lance(maria, 4000.00));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        Assert.assertEquals(4000.00, leiloeiro.getMaiorTodos(), 0.00001);
        Assert.assertEquals(2000.00, leiloeiro.getMenorTodos(), 0.00001);

    }
}
