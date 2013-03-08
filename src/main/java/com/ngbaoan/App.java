package com.ngbaoan;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.SyndFeedOutput;
import com.sun.syndication.io.XmlReader;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) throws IllegalArgumentException,
                                        FeedException,
                                        IOException {
    URL feedUrl = new URL("http://www.theverge.com/rss/index.xml");
    SyndFeedInput input = new SyndFeedInput();
    SyndFeed feed = input.build(new XmlReader(feedUrl));
    // System.out.println(feed);

    System.out.println("Formats valides : rss_0.9, rss_0.91, rss_0.92, rss_0.93,");
    System.out.println("                  rss_0.94, rss_1.0, rss_2.0, atom_0.3, atom_1.0");
    System.out.println("------------------------------------------");

    String outputType = "atom_1.0";
    feed.setFeedType(outputType);
    SyndFeedOutput output = new SyndFeedOutput();
    output.output(feed, new PrintWriter(System.out));

  } // Lecteur

}
