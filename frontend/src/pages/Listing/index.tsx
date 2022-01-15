
import MovieCard from "Components/MovieCard";
import Pagination from "Components/Navbar/Pagination";

function Listing() {


    return (

        <>

            <Pagination />


            <div className="container">
                <div className="row">
                    <div className=" col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className=" col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className=" col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className=" col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                        <MovieCard />
                    </div>
                </div>
            </div>

        </>
    );


}
export default Listing;