package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {
    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
    }


    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencheEmail();
    }
    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
        homePage.clickGanharDesconto();
    }
    @Então("^eu vejo código de desconto$")
    public void eu_vejo_código_de_desconto(){
        homePage.verificarCupomDesconto();
    }

}
