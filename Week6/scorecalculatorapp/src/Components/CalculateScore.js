import './Stylesheets/mystyle.css'
const percentTODecirnal = (decimal) {
    return (decimal.toFixed(2) + '%')
}
const calcScore = (total, goal) => {
    return percentToDecimal(tota / goal)
}

export const CalculateScore = ({ Name, School, total, goal }) => (
    <div dassName="formatstyle">
        <h1><font color="Brown">Student Detaits:</font></h1>


        <div dassName="Name">
            <b> <span> Name: </span> </b>
            <span>{Name}</span>
        </div>
        <div dassName="School">
            <b> <span> School: </span> </b>
            <span>{School}</span>
        </div>
        <div dassName="Total">
            <b><span>Total:</span> </b>
            <span> {total}</span>
            <span>Marks</span>
        </div>
        <div dassName="Score">
            <b><span>Score:</span> </b>
            <span> {calcScore(total, goal)}</span>

        </div>
    </div>
)