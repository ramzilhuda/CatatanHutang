package com.example.catatanhutang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CatatanAdapter extends RecyclerView.Adapter<CatatanAdapter.MyViewHolder> {
    // 1. tambahkan extends pada CatatanAdapter
    // 2. tambahkan ReyclerView.Adapter<CatatanAdapter.MyViewHolder>
    // 3. tekan alt + enter sampai tidak ada tanda merah
    // 4. buat private Context context;
    // 5. buat private List<CatatanModel> data = new ArrayList<>()
    // 6. Klik Kanan pilih Generete > Constructor
    // 7. buat pada public MyViewHolder onCreate : View itemView = LayoutInflater.from(context).inflate(R.layout.item_catatan, parent,false);
    // 8. rubah return null > new MyViewHolder(itemView)
    // 9. tambahakan pada baris public class MyViewHolder extends RecyclerView.ViewHolder : TextView tvJudul, tvJumlah, tvTanggal
    //10. deklarasikan tvJudul, tvJumlah, tvTanggal = itemView.findViewbyId(R.Id.tvJudul);
    //11. tambahkan 3 holder (tvJudul,tvJumlah, tvTanggal ) public void onBindViewHolder(@NonNull MyViewHolder holder, int position) : holder.tvJudul.setText(data.get(position).getJudul());
    //12. tambahkan pada public int getItemCount : return data.size()
    //13. kembali ke MainAcitivity


    private Context context;
    private List<CatatanModel> data = new ArrayList<>();

    public CatatanAdapter(Context context, List<CatatanModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.item_catatan, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvJudul.setText(data.get(position).getJudul());
        holder.tvJumlah.setText("Rp."+data.get(position).getJumlahhutang());
        holder.tvTanggal.setText(data.get(position).getTanggal());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvJudul, tvJumlah, tvTanggal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvJumlah = itemView.findViewById(R.id.tvJumlah);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
        }
    }
}
