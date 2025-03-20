public class Sign
{
    private String message; 
    private int width;
    public Sign(String m, int w)
    {
        message = m;
        width = w;
    }

    public int numberOfLines(){
        int lines = message.length()/width;
        if(message.length() % width == 0) return lines;
        return lines + 1;
    }

    public String getLines(){
        String s = "";
        if(message.length() == 0) return null;
        for (int i = 0; i < message.length(); i++){
            s += message.substring(i, i+1);
            if ((i+1) % width == 0 && i != message.length()-1) s += ";";
        }
        return s;
    }
}