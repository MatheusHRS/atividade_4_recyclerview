package br.edu.unis.aplicativosmoveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MailsActivity extends AppCompatActivity {

    RecyclerView rvMails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        rvMails = findViewById(R.id.rv_disciplines);
        rvMails.setLayoutManager(new LinearLayoutManager(this));

        List<Mail> Mails = new ArrayList<>();
        Mails.add(new Mail("Rappi", "Rappi é mais", "Vem aproveitar seu desconto", R.color.teal_200));
        Mails.add(new Mail("Twitter", "Destaques da semana", "Você tem novos seguidores", R.color.purple_500));
        Mails.add(new Mail("The News", "Ataque em nyc", "NYC mais perigosa", R.color.purple_700));
        Mails.add(new Mail("Amazon", "Apple Iphone 12", "Ofertas do dia da Apple", R.color.teal_200));
        Mails.add(new Mail("Linkedin", "Você tem novas conexões", "Visualize suas novas conexões", R.color.purple_500));
        Mails.add(new Mail("Casas Bahia", "Quer ganhar até 1500 OFF?", "Clica e garanta um novo smartphone", R.color.purple_700));
        Mails.add(new Mail("Facebook", "Aniversariantes do dia", "Mande mensagens a seus amigos aniversariantes",R.color.teal_200));
        Mails.add(new Mail("Nuuvem", "Tem jogo da sua lista de desejo com desconto", "Aproveite as novas promoções", R.color.purple_500));
        Mails.add(new Mail("Microsoft Bing", "Noticias mais populares", "Sua atualização semanal", R.color.purple_700));
        Mails.add(new Mail("Warner Bros Brasil", "Star Wars chegou", "É hora de conferir as ultimas novidades",R.color.teal_200));



        MailsAdapter adapter = new MailsAdapter(Mails);
        rvMails.setAdapter(adapter);
    }
}