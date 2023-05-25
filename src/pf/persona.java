/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

/**
 *
 * @author USUARIO
 */
public class persona {
    
    int  H,P,SP,Q,L,S,PP,TM,PAN,CN,SL,valor;

    public persona(int H, int P, int SP, int Q, int L, int S, int PP, int TM, int PAN, int CN, int SL, int valor) {
        this.H = H;
        this.P = P;
        this.SP = SP;
        this.Q = Q;
        this.L = L;
        this.S = S;
        this.PP = PP;
        this.TM = TM;
        this.PAN = PAN;
        this.CN = CN;
        this.SL = SL;
        this.valor = valor;
    }

    persona(int H) {
    }

    persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void setH(int H) {
        this.H = H;
    }

    public int getH() {
        return H;
    }

    

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public int getQ() {
        return Q;
    }

    public void setQ(int Q) {
        this.Q = Q;
    }

    public int getL() {
        return L;
    }

    public void setL(int L) {
        this.L = L;
    }

    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getTM() {
        return TM;
    }

    public void setTM(int TM) {
        this.TM = TM;
    }

    public int getPAN() {
        return PAN;
    }

    public void setPAN(int PAN) {
        this.PAN = PAN;
    }

    public int getCN() {
        return CN;
    }

    public void setCN(int CN) {
        this.CN = CN;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
