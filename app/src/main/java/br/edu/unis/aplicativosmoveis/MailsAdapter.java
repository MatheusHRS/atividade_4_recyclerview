package br.edu.unis.aplicativosmoveis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MailsAdapter extends RecyclerView.Adapter<MailsAdapter.ViewHolder> {

    private List<Mail> Mails;

    public MailsAdapter(List<Mail> Mails) {
        this.Mails = Mails;
    }

    @NonNull
    @Override
    public MailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
            .from(parent.getContext())
            .inflate(R.layout.mails_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mail Mail = this.Mails.get(position);
        holder.bind(Mail);
    }

    @Override
    public int getItemCount() {
        return this.Mails.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Mail Mail) {
            TextView txtName = itemView.findViewById(R.id.txt_Mails_name);
            TextView txtsubject = itemView.findViewById(R.id.tvEmailTitle);
            TextView txtMessage = itemView.findViewById(R.id.tvEmailDetails);
            LinearLayout linearLayout = itemView.findViewById(R.id.linear_Mails_item);

            txtName.setText(Mail.getName());
            txtsubject.setText(Mail.getsubject());
            txtMessage.setText(Mail.getmessage());
            linearLayout.setBackgroundResource(Mail.getBackgroundColor());
        }
    }
}
