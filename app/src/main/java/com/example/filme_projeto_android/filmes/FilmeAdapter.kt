import com.example.filme_projeto_android.filmes.FilmesData

class FilmesAdapter(private val movies: List<FilmesData>) : RecyclerView.Adapter<FilmesAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewMoviePoster: ImageView = itemView.findViewById(R.id.imageViewMoviePoster)
        val textViewMovieTitle: TextView = itemView.findViewById(R.id.textViewMovieTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.textViewMovieTitle.text = movie.title
        Glide.with(holder.itemView.context)
            .load("https://image.tmdb.org/t/p/w500${movie.poster_path}")
            .into(holder.imageViewMoviePoster)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
