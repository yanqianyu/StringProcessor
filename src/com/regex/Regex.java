package com.regex;

import java.util.ArrayList;
import com.Token.*;

/*
 * Regular Expression
 */

public class Regex {
    private ArrayList<Tok> TokenSeq;  
    private int L = 0, R = 0;
    
    public Regex(){
        TokenSeq = new ArrayList<Tok>();
    }
    
    public Regex(Tok tok){
        TokenSeq = new ArrayList<Tok>();
        TokenSeq.add(tok);
    }
    
    public void setRange(int l, int r){
        L = l;
        R = r;
    }
    
    public int getL(){
        return L;
    }
    
    public int getR(){
        return R;
    }
    
    public void addTok(Tok tok){
        TokenSeq.add(tok);
    }
    
    public void addRegex(Regex r){
        TokenSeq.addAll(r.TokenSeq);
        if (r.R != 0)
            this.R = r.R;
    }
    
    public int getSize(){
        return TokenSeq.size();
    }
    
    public Tok getTokenAt(int pos){
        return TokenSeq.get(pos);
    }
    
    public Regex clone(){
        Regex c = new Regex();
        for (int i = 0; i < this.TokenSeq.size(); i++){
            c.addTok(this.TokenSeq.get(i));
        }
        c.L = this.L;
        c.R = this.R;
        return c;
    }
    
    public boolean isVoid(){
        if (TokenSeq.size() == 1 && TokenSeq.get(0) == Tok.VoidTok)
            return true;
        return false;
    }
    
    public void setToken(int pos, Tok tok){
        TokenSeq.set(pos, tok);
    }
}