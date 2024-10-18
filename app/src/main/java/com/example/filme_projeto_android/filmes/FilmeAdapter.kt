package com.example.filme_projeto_android.filmes

class FilmeAdapter(private val filmes: List<Filme>) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    class FilmeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tituloFilme: TextView = view.findViewById(R.id.tituloFilme)
        val descricaoFilme: TextView = view.findViewById(R.id.descricaoFilme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filme, parent, false)
        return FilmeViewHolder(view)
    }
    /* incompleto */

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filme = filmes[position]
        holder.tituloFilme.text = filme.titulo
        holder.descricaoFilme.text = filme.descricao
    }

    override fun getItemCount(): Int {
        return filmes.size
    }
}